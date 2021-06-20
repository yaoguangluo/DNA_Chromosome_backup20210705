package OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.life;

import java.util.concurrent.CopyOnWriteArrayList;

import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.PP.Study_P_Issues;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.analysis.Study_A_Issues;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.management.Study_M_Issues;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.operation.Study_O_Issues;

public class StudyIssues{
	public void studyDefinition() {

	}
	public void studyImplementation() {

	}
	public void studyCombination() {

	}
	public void studyExtension() {

	}
	public void studyAckquisition() {

	}
	public void philosothon(CopyOnWriteArrayList<String> read) {
		//a
		new Study_A_Issues().vpcsInitons();
		//o
		new Study_O_Issues().vpcsInitons();
		//p
		new Study_P_Issues().vpcsInitons();
		//m
		new Study_M_Issues().vpcsInitons();
	}
}