package SEM.bloom;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
//用来索引24组花
//罗瑶光
public class StaticRootMap{
	
	public static Map<String, StaticClassMap>  staticRootMap;

	public void initMap() throws IOException {
		staticRootMap= new HashMap<>();
		
		StaticClassMap map_A_VECS= new StaticClassMap("A_VECS");
		StaticClassMap map_A_IDUQ= new StaticClassMap("A_IDUQ");
		StaticClassMap map_O_VECS= new StaticClassMap("O_VECS");
		StaticClassMap map_O_IDUQ= new StaticClassMap("O_IDUQ");
		StaticClassMap map_P_VECS= new StaticClassMap("P_VECS");
		StaticClassMap map_P_IDUQ= new StaticClassMap("P_IDUQ");
		StaticClassMap map_M_VECS= new StaticClassMap("M_VECS");
		StaticClassMap map_M_IDUQ= new StaticClassMap("M_IDUQ");
		StaticClassMap map_V_AOPM= new StaticClassMap("V_AOPM");
		StaticClassMap map_V_IDUQ= new StaticClassMap("V_IDUQ");
		StaticClassMap map_E_AOPM= new StaticClassMap("E_AOPM");
		StaticClassMap map_E_IDUQ= new StaticClassMap("E_IDUQ");
		StaticClassMap map_C_AOPM= new StaticClassMap("C_AOPM");
		StaticClassMap map_C_IDUQ= new StaticClassMap("C_IDUQ");
		StaticClassMap map_S_AOPM= new StaticClassMap("S_AOPM");
		StaticClassMap map_S_IDUQ= new StaticClassMap("S_IDUQ");
		StaticClassMap map_I_AOPM= new StaticClassMap("I_AOPM");
		StaticClassMap map_I_VECS= new StaticClassMap("I_VECS");
		StaticClassMap map_D_AOPM= new StaticClassMap("D_AOPM");
		StaticClassMap map_D_VECS= new StaticClassMap("D_VECS");
		StaticClassMap map_U_AOPM= new StaticClassMap("U_AOPM");
		StaticClassMap map_U_VECS= new StaticClassMap("U_VECS");
		StaticClassMap map_Q_AOPM= new StaticClassMap("Q_AOPM");
		StaticClassMap map_Q_VECS= new StaticClassMap("Q_VECS");
		//
		//A
		staticRootMap.put("A_VECS", map_A_VECS);
		staticRootMap.put("A_IDUQ", map_A_IDUQ);
		//O
		staticRootMap.put("O_VECS", map_O_VECS);
		staticRootMap.put("O_IDUQ", map_O_IDUQ);
		//P
		staticRootMap.put("P_VECS", map_P_VECS);
		staticRootMap.put("P_IDUQ", map_P_IDUQ);
		//M
		staticRootMap.put("M_VECS", map_M_VECS);
		staticRootMap.put("M_IDUQ", map_M_IDUQ);
		//V
		staticRootMap.put("V_AOPM", map_V_AOPM);
		staticRootMap.put("V_IDUQ", map_V_IDUQ);
		//E
		staticRootMap.put("E_AOPM", map_E_AOPM);
		staticRootMap.put("E_IDUQ", map_E_IDUQ);
		//C
		staticRootMap.put("C_AOPM", map_C_AOPM);
		staticRootMap.put("C_IDUQ", map_C_IDUQ);
		//S
		staticRootMap.put("S_AOPM", map_S_AOPM);
		staticRootMap.put("S_IDUQ", map_S_IDUQ);
		//I
		staticRootMap.put("I_VECS", map_I_VECS);
		staticRootMap.put("I_AOPM", map_I_AOPM);
		//D
		staticRootMap.put("D_VECS", map_D_VECS);
		staticRootMap.put("D_AOPM", map_D_AOPM);
		//U
		staticRootMap.put("U_VECS", map_U_VECS);
		staticRootMap.put("U_AOPM", map_U_AOPM);
		//Q
		staticRootMap.put("Q_VECS", map_Q_VECS);
		staticRootMap.put("Q_AOPM", map_Q_AOPM);
		
	}
}