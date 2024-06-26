package pack1.aboutus;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class AboutUsController {

    @FXML
    private FontAwesomeIconView Fb1;

    @FXML
    private FontAwesomeIconView Fb2;

    @FXML
    private FontAwesomeIconView Fb3;

    @FXML
    private FontAwesomeIconView Fb4;

    @FXML
    private FontAwesomeIconView Insta1;

    @FXML
    private FontAwesomeIconView Insta2;

    @FXML
    private FontAwesomeIconView Insta3;

    @FXML
    private FontAwesomeIconView Insta4;

    @FXML
    private FontAwesomeIconView Git1;

    @FXML
    private FontAwesomeIconView Git2;

    @FXML
    private FontAwesomeIconView Git3;

    @FXML
    private FontAwesomeIconView Git4;

    /**
     * The three ActionEvent methods will be used when the controller will be moved in the com directory, till then it will remain in commit.
     */

//    @FXML
//    void jobPostbtn(ActionEvent event) {
//        Navigation.navigateTo(event, "/com/jobportal/Post.fxml");
//    }

//    @FXML
//    void navigateToHome(ActionEvent event) {
//        Navigation.navigateTo(event, "/com/jobportal/Home.fxml");
//    }

//    @FXML
//    void navigateToNotification(ActionEvent event) {
//        Navigation.navigateTo(event, "/com/jobportal/Notification.fxml"); }

    @FXML
    void Fb1pressed(MouseEvent event) {
        String url = "https://www.facebook.com/share/Wn8Uy8xc1n5w2M85/?mibextid=qi2Omg";

        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void Fb2pressed(MouseEvent event) {
        String url = "https://www.facebook.com/login.php/";

        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void Fb3pressed(MouseEvent event) {
        String url = "https://www.facebook.com/profile.php?id=100039976382069&mibextid=ZbWKwL";

        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void Fb4pressed(MouseEvent event) {
        String url = "https://www.facebook.com/profile.php?id=100083871731071&name=xhp_nt_";

        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void Insta1pressed(MouseEvent event) {
        String url = "https://www.instagram.com/anassohail12?igsh=ZDU2OWxpOHF5OGl4";

        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void Insta2pressed(MouseEvent event) {
        String url = "https://www.instagram.com/accounts/login/";

        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void Insta3pressed(MouseEvent event) {
        String url = "https://www.instagram.com/ali._.ahmed21?igsh=MWhpNGdzcWNiZzRwdQ==";

        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void Insta4pressed(MouseEvent event) {
        String url = "https://www.instagram.com/syedhassan1670/";

        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void Git1Clicked(MouseEvent event) {
        String url = "";

        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void Git2Clicked(MouseEvent event) {
        String url = "https://github.com/Huzaifa-5320";

        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void Git3Clicked(MouseEvent event) {
        String url = "";

        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void Git4Clicked(MouseEvent event) {
        String url = "https://github.com/syedhassanhussain";

        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }
}

