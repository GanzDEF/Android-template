package com.aisdev.testutils.testrules

import org.amshove.kluent.mock
import org.junit.rules.TestRule
import org.junit.runner.Description
import org.junit.runners.model.Statement

fun TestRule.runRule(statement: () -> Unit) {
    apply(
        object : Statement() {
            override fun evaluate() {
                statement()
            }
        },
        mock(Description::class)
    ).evaluate()
}
