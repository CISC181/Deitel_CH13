module DeitelCode {

	requires javafx.base;
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;

	opens ch13.CoverViewerCustomListView;
	opens ch13.ColorChooser;
	opens ch13.CoverViewer;
	opens ch13.Painter;

}