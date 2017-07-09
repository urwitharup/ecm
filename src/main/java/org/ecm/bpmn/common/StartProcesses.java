/**
 * 
 */
package org.ecm.bpmn.common;

/**
 * @author bipasabasu
 *
 */

import org.camunda.bpm.application.PostDeploy;
import org.camunda.bpm.application.PreUndeploy;
import org.camunda.bpm.application.ProcessApplication;
import org.camunda.bpm.application.impl.ServletProcessApplication;
import org.camunda.bpm.engine.ProcessEngine;

@ProcessApplication("ECM Process App")
public class StartProcesses extends ServletProcessApplication{
	
	 @PostDeploy
	  public void startProcess(ProcessEngine processEngine) {
	    
	    processEngine.getRuntimeService().startProcessInstanceByKey("planProject");
	    
	  }

	  @PreUndeploy
	  public void remove() {
	    
	  }

}