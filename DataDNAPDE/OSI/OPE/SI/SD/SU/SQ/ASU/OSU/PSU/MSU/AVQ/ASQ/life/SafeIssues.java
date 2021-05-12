package OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.life;

import java.util.concurrent.CopyOnWriteArrayList;

import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.PP.SafeProcessIssues;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.analysis.SafeAnalysisIssues;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.management.SafeManagementIssues;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.operation.SafeOperationIssues;

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
		new SafeAnalysisIssues().vpcsInitons();
		//o
		new SafeOperationIssues().vpcsInitons();
		//p
		new SafeProcessIssues().vpcsInitons();
		//m
		new SafeManagementIssues().vpcsInitons();
	}
}