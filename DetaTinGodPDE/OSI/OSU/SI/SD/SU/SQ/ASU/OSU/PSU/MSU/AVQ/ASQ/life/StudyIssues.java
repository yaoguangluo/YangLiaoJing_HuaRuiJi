package OSI.OSU.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.life;

import java.util.concurrent.CopyOnWriteArrayList;

import OSI.OSU.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.analysis.StudyAnalysisIssues;
import OSI.OSU.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.management.StudyManagementIssues;
import OSI.OSU.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.operation.StudyOperationIssues;
import OSI.OSU.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.process.StudyProcessIssues;

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
		new StudyAnalysisIssues().vpcsInitons();
		//o
		new StudyOperationIssues().vpcsInitons();
		//p
		new StudyProcessIssues().vpcsInitons();
		//m
		new StudyManagementIssues().vpcsInitons();
	}
}