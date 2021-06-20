package OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.life;

import java.util.concurrent.CopyOnWriteArrayList;

import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.PP.Help_P_Issues;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.analysis.Help_A_Issues;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.management.Help_M_Issues;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.operation.Help_O_Issues;

public class HelpIssues{
	public void helpDefinition() {

	}
	public void helpImplementation() {

	}
	public void helpCombination() {

	}
	public void helpExtension() {

	}
	public void helpAckquisition() {

	}
	public void philosothon(CopyOnWriteArrayList<String> read) {
		//a
		new Help_A_Issues().vpcsInitons();
		//o
		new Help_O_Issues().vpcsInitons();
		//p
		new Help_P_Issues().vpcsInitons();
		//m
		new Help_M_Issues().vpcsInitons();
	}
}