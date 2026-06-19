import javax.swing.*
import java.awt.*

fun main() {
    SwingUtilities.invokeLater {

        val frame = JFrame("Kotlin GUI App")
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        frame.setSize(300, 200)

        val label = JLabel("Hello Kotlin GUI", SwingConstants.CENTER)
        val button = JButton("Click Me")

        button.addActionListener {
            label.text = "Button Clicked!"
        }

        frame.layout = BorderLayout()
        frame.add(label, BorderLayout.CENTER)
        frame.add(button, BorderLayout.SOUTH)

        frame.isVisible = true
    }
}