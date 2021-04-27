package OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.life;

import java.util.concurrent.CopyOnWriteArrayList;

import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.PP.WorkProcessIssues;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.analysis.WorkAnalysisIssues;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.management.WorkManagementIssues;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.operation.WorkOperationIssues;

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
		new WorkAnalysisIssues().vpcsInitons();
		//o
		new WorkOperationIssues().vpcsInitons();
		//p
		new WorkProcessIssues().vpcsInitons();
		//m
		new WorkManagementIssues().vpcsInitons();
	}
}