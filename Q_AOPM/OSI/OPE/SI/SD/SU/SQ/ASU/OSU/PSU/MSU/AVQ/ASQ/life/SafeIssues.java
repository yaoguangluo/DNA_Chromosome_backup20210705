package OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.life;

import java.util.concurrent.CopyOnWriteArrayList;

import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.PP.Safe_P_Issues;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.analysis.Safe_A_Issues;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.management.Safe_M_Issues;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.operation.Safe_O_Issues;

public class SafeIssues{
	public void safeDefinition() {

	}
	public void safeImplementation() {

	}
	public void safeCombination() {

	}
	public void safeExtension() {

	}
	public void safeAckquisition() {

	}
	public void philosothon(CopyOnWriteArrayList<String> read) {
		//a
		new Safe_A_Issues().vpcsInitons();
		//o
		new Safe_O_Issues().vpcsInitons();
		//p
		new Safe_P_Issues().vpcsInitons();
		//m
		new Safe_M_Issues().vpcsInitons();
	}
}