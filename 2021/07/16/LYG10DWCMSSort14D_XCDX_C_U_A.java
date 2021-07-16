package OEU.LYG4DQS4D;
//20200314 集成了最新的小高峰过滤催化排序5代思想。
//20200818 集成了最新的小高峰过滤催化排序9代思想。
//增加同拼音同笔画的字按char的int大小区分20210529
//罗瑶光

//今天将新陈代谢技术应用到 中文拼音笔画分词上.
//罗瑶光
public class LYG10DWCMSSort14D_XCDX_C_U_A extends LYG10DWCMSSort13D_XCDX_C_A implements LYG10DWCMSSort13D_XCDX_C_U_A_C {

	public void processKernel(String[] kernel, int leftPosition
			, int rightPosition, int scale, int point) {
		int rightPositionReflection= rightPosition;
		if(point> scale) {
			return;
		}
		processQS4DLYG9D(kernel, leftPosition, rightPosition, scale, point, 0);
		int i;
		for(i= leftPosition; i<= rightPosition; i++) {
			if(!(kernel[i].length()<= point|| kernel[leftPosition].length()<= point)) {
				if(kernel[i].charAt(point)!= kernel[leftPosition].charAt(point)){
					rightPositionReflection= i- 1;
					processKernel(kernel, leftPosition, rightPositionReflection, scale, point+ 1);
					leftPosition= i;
				}
			}
		}
		if(leftPosition!= rightPosition) {
			processKernel(kernel, leftPosition, i- 1, scale, point+ 1);
		}
	}

	public void processSort(String[] kernel, int leftPosition
			, int rightPosition, int scale, int point) {
		if(point> scale) {
			return;
		}
		for(int i= leftPosition; i<= rightPosition; i++) {
			Here:
				for(int j= i; j<= rightPosition; j++) {
					if(i== j) {
						continue Here;
					}
					if(kernel[i].length()<= point|| kernel[j].length()<= point) {
						if(kernel[i].length()< kernel[j].length()) {
							for(int p= 0; p< scale; p++) {
								if(!(kernel[i].length()<= p|| kernel[j].length()<= p)) {
									if(kernel[i].charAt(p)!= kernel[j].charAt(p)) {
										continue Here;
									}
								}
							}
							String temp= kernel[i].toString();;
							kernel[i]= kernel[j].toString();;
							kernel[j]= temp;
						}
						continue Here;
					}else {
						boolean hasXi= pinyin.containsKey(""+ kernel[i].charAt(point));
						boolean hasXj= pinyin.containsKey(""+ kernel[j].charAt(point));
						boolean hasBi= bihua.containsKey(""+ kernel[i].charAt(point));
						boolean hasBj= bihua.containsKey(""+ kernel[j].charAt(point));
						if(!(!hasXi|| !hasXj)){//都有拼音
							String[] js= new String[2];
							js[0]= this.pinyin.get(""+ kernel[i].charAt(point));
							js[1]= this.pinyin.get(""+ kernel[j].charAt(point));
							if(js[0].equalsIgnoreCase(js[1])) {
								if(!(!hasBi|| !hasBj)){//都有笔画
									if(this.bihua.get(""+ kernel[i].charAt(point))
											> this.bihua.get(""+ kernel[j].charAt(point))) {
										String temp= kernel[i].toString();
										kernel[i]= kernel[j].toString();
										kernel[j]= temp;
										continue Here;
									}else if(this.bihua.get(""+ kernel[i].charAt(point))
											== this.bihua.get(""+ kernel[j].charAt(point))) {
										int asci=kernel[i].charAt(point);
										int ascj=kernel[j].charAt(point);
										if(asci< ascj) {//根据前面select的sort定义来规范,盲目改成大于会出错.
											String temp= kernel[i].toString();
											kernel[i]= kernel[j].toString();
											kernel[j]= temp;
											continue Here;
										}
									}
								}
							}
							boolean change= processSortpinyin(js, 3);	
							if(!(!change|| i>= j)) {
								String temp= kernel[i].toString();
								kernel[i]= kernel[j].toString();
								kernel[j]= temp;
							}
							continue Here;
						}else if(!(hasXi|| !hasXj)){//其中一个有拼音
							if(i< j) {
								if(!(i== rightPosition+1 || j== rightPosition+1)) {
									String temp= kernel[i].toString();
									kernel[i]= kernel[j].toString();
									kernel[j]= temp;
								}
							}
							continue Here;
						}else if(!(!hasXi|| hasXj)){
							if(i> j) {
								if(!(i== rightPosition+1 || j== rightPosition+1)) {
									String temp= kernel[i].toString();
									kernel[i]= kernel[j].toString();
									kernel[j]= temp;
								}
							}
							continue Here;
						}else if(!(hasXi|| hasXj)){//都没有拼音
							if(kernel[i].toLowerCase().charAt(point)
									> kernel[j].toLowerCase().charAt(point)) {
								if(i< j) {
									String temp= kernel[i].toString();
									kernel[i]= kernel[j].toString();
									kernel[j]= temp;
								}
								continue Here;
							}
							if(kernel[i].toLowerCase().charAt(point)
									== kernel[j].toLowerCase().charAt(point)) {
								if(kernel[i].charAt(point)> kernel[j].charAt(point)) {
									if(i< j) {
										String temp= kernel[i].toString();
										kernel[i]= kernel[j].toString();
										kernel[j]= temp;
									}
								}
								continue Here;
							}
						}
					}
				}
		}
	}

	public void processQS4DLYG9D(String[] kernel, int leftPosition
			, int rightPosition, int scale, int point, int deep) {
		if(leftPosition< rightPosition){
			int c= rightPosition- leftPosition+ 1;
			if(!(c< this.range|| deep> this.deeps)) {//增加了deep
				int pos= partition(kernel, leftPosition, rightPosition, scale, point);
				if(leftPosition< pos- 1) {
					processQS4DLYG9D(kernel, leftPosition, pos- 1, scale, point, deep+ 1);
				}
				if(pos+ 1< rightPosition) {
					processQS4DLYG9D(kernel, pos+ 1, rightPosition, scale, point, deep+ 1);
				}
				return;
			}
			processSort(kernel, leftPosition, rightPosition, scale, point);
			return;
		}
	}

	public int partition(String[] array, int leftPosition, int rightPosition, int scale, int point) {
		String x= findSmall(array, scale, point, leftPosition, rightPosition, rightPosition)
				? array[rightPosition]: array[leftPosition];
		int leftPositionReflection= leftPosition;
		while(leftPositionReflection++ < rightPosition--) {
			while(!(findSmallWithTwoChar(array[leftPositionReflection++]
					, x, scale, point)|| leftPositionReflection> rightPosition)) {} 
			while(findSmallWithTwoChar(array[rightPosition--], x, scale, point)){}
			if(--leftPositionReflection< ++rightPosition){
				String temp= array[rightPosition].toString();;
				array[rightPosition]= array[leftPositionReflection].toString();;
				array[leftPositionReflection]= temp;
			}
		}
		array[leftPosition]= array[rightPosition].toString();
		array[rightPosition]= x;
		return rightPosition;
	}
}