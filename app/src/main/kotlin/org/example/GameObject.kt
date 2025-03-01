package org.example

import javafx.scene.Node

interface GameObject {
    val node: Node
    fun update()
} 