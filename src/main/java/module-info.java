module br.com.joaocarloslima {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.com.joaocarloslima to javafx.fxml;
    exports br.com.joaocarloslima;
    exports br.com.joaocarloslima.Entity.Plantacoes;
    opens br.com.joaocarloslima.Entity.Plantacoes to javafx.fxml;
    exports br.com.joaocarloslima.Entity.Lugar;
    opens br.com.joaocarloslima.Entity.Lugar to javafx.fxml;
}
