package temporizadorModeloDatos;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import java.security.AccessControlContext;

public class Temporizador extends Thread {
    private PropertyChangeSupport _propertyChangeSupport = new PropertyChangeSupport(this);

    public Temporizador(ThreadGroup threadGroup, Runnable runnable, String string, long l) {
        super(threadGroup, runnable, string, l);
    }

    public Temporizador(ThreadGroup threadGroup, Runnable runnable, String string) {
        super(threadGroup, runnable, string);
    }

    public Temporizador(Runnable runnable, String string) {
        super(runnable, string);
    }

    public Temporizador(ThreadGroup threadGroup, String string) {
        super(threadGroup, string);
    }

    public Temporizador(String string) {
        super(string);
    }

    public Temporizador(ThreadGroup threadGroup, Runnable runnable) {
        super(threadGroup, runnable);
    }

    public Temporizador(Runnable runnable, AccessControlContext accessControlContext) {
        super(runnable, accessControlContext);
    }

    public Temporizador(Runnable runnable) {
        super(runnable);
    }

    public Temporizador() {
        super();
    }
    //Varibles
    private int segundos =0; 
    private int segundosFin =10;

    public void setSegundos(int segundos) {
        int oldSegundos = this.segundos;
        this.segundos = segundos;
        _propertyChangeSupport.firePropertyChange("segundos", oldSegundos, segundos);
    }

    public void setSegundosFin(int segundosFin) {
        int oldSegundosFin = this.segundosFin;
        this.segundosFin = segundosFin;
        _propertyChangeSupport.firePropertyChange("segundosFin", oldSegundosFin, segundosFin);
    }

    @Override
    public void run() {
        // TODO Implement this method
        super.run();
    }

    public void addPropertyChangeListener(PropertyChangeListener l) {
        _propertyChangeSupport.addPropertyChangeListener(l);
    }

    public void removePropertyChangeListener(PropertyChangeListener l) {
        _propertyChangeSupport.removePropertyChangeListener(l);
    }
}
