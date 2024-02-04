package com.ranjs.expense.tracker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ExpenseTrackerApplication

fun main(args: Array<String>) {
	runApplication<ExpenseTrackerApplication>(*args)
}
