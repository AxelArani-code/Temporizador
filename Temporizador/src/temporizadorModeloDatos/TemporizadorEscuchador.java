package temporizadorModeloDatos;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public abstract class TemporizadorEscuchador implements PropertyChangeListener {
    public TemporizadorEscuchador() {
        super();
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        // TODO Implement this method
        notificar(propertyChangeEvent);
    }
    //Crear llamado 
    public abstract void notificar(PropertyChangeEvent propertyChangeEvent);
}
