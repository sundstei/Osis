package com.osis

import com.osis.tasks.Task

class ToDoList
{
	static constraints = {
	}

	String name
	User user
	static hasMany = [tasks: Task]

	static belongsTo = [User]
}
