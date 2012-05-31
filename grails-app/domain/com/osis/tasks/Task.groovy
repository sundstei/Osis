package com.osis.tasks

class Task
{
	String name
	Date dueDate
	Integer estimatedHours
	Integer priority
	TaskCategory category

	static constraints = {
	}

	static hasMany = [taskTags: TaskTag]

}
