package com.sososeen.credential

import org.gradle.api.Plugin
import org.gradle.api.Project

class CredentialPlugin implements Plugin<Project>{
	@Override
	void apply(Project project){
		project.extensions.create('userCredential',CredentialExtension)
		project.tasks.create('printUserCredential') << {
			 println "username is: " + project.userCredential.username
			 println "password is: " + project.userCredential.password
		}
	}
}
