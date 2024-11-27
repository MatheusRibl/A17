import javax.swing.*;
import java.awt.*;

public abstract class CadastroVisualizacao {
    protected final JFrame principal;

    public CadastroVisualizacao(JFrame principal) {
        this.principal = principal;
    }

    // Método genérico, mas pode ser sobrescrito
    public abstract void exibir();
}