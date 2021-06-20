package OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.life;

import java.util.concurrent.CopyOnWriteArrayList;

import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.PP.Work_P_Issues;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.analysis.Work_A_Issues;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.management.Work_M_Issues;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.operation.Work_O_Issues;

public class WorkIssues{
	public void workDefinition() {

	}
	public void workImplementation() {

	}
	public void workCombination() {

	}
	public void workExtension() {

	}
	public void workAckquisition() {

	}
	public void philosothon(CopyOnWriteArrayList<String> read) {
		//a
		new Work_A_Issues().vpcsInitons();
		//o
		new Work_O_Issues().vpcsInitons();
		//p
		new Work_P_Issues().vpcsInitons();
		//m
		new Work_M_Issues().vpcsInitons();
	}
}