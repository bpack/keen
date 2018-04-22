module com.ioglyph.keen.ui {
    // Export for javafx to instantiate main application class
    exports com.ioglyph.keen.ui to javafx.graphics;

    requires javafx.graphics;
    requires javafx.controls;

    requires com.ioglyph.keen.engine;
}
