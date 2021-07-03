package OEI.ME.pos.E;

import OCI.ME.pos.C.Pos_C_XCDX;
import OCI.ME.pos.C.Pos_C_XCDX_E;
import OCI.ME.pos.C.Pos_C_XCDX_O;
import OCI.ME.pos.C.Pos_C_XCDX_P;

public class Pos_CE_XCDX implements Pos_C_XCDX{
	public Pos_C_XCDX_O pos_C_XCDX_O;
	public Pos_C_XCDX_P pos_C_XCDX_P;
	public Pos_C_XCDX_E pos_C_XCDX_E;
	
	public Pos_CE_XCDX() {
		pos_C_XCDX_O= new Pos_CE_XCDX_O();
		pos_C_XCDX_P= new Pos_CE_XCDX_P();
		pos_C_XCDX_E= new Pos_CE_XCDX_E();
	}
}