package OEU.LYG4DQS4D;
//20200314 ���������µ�С�߷���˴߻�����5��˼�롣
//20200818 ���������µ�С�߷���˴߻�����9��˼�롣
//����ͬƴ��ͬ�ʻ����ְ�char��int��С����20210529
//������

//���콫�³´�л����Ӧ�õ� ����ƴ���ʻ��ִ���.
//������
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
						if(!(!hasXi|| !hasXj)){//����ƴ��
							String[] js= new String[2];
							js[0]= this.pinyin.get(""+ kernel[i].charAt(point));
							js[1]= this.pinyin.get(""+ kernel[j].charAt(point));
							if(js[0].equalsIgnoreCase(js[1])) {
								if(!(!hasBi|| !hasBj)){//���бʻ�
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
										if(asci< ascj) {//����ǰ��select��sort�������淶,äĿ�ĳɴ��ڻ����.
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
						}else if(!(hasXi|| !hasXj)){//����һ����ƴ��
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
						}else if(!(hasXi|| hasXj)){//��û��ƴ��
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
			if(!(c< this.range|| deep> this.deeps)) {//������deep
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