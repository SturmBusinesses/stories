package com.strumbusiness.memories

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MemoriesApplication {
	companion object {
		@JvmStatic fun main(args: Array<String>) {
			runApplication<MemoriesApplication>(*args)
	}
}


