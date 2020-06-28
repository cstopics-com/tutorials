package com.kobdan.batch;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class MyTasklet implements Tasklet { 

	@Override 
	public RepeatStatus execute(StepContribution arg0, ChunkContext arg1) throws Exception {  
		System.out.println("Hello This is a sample example of spring batch"); 
		return RepeatStatus.FINISHED; 
	} 
} 
