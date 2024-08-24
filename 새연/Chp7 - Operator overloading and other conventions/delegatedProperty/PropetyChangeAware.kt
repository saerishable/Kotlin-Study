package destructingDeclaration

import java.beans.PropertyChangeListener

open class PropetyChangeAware {
    protected val changeSupport = PropetyChangeSupport(this)

    fun addPropertyChangeListener(listener: PropertyChangeListener) {
        changeSupport.addPropertyChangelistener(listener)
    }

    fun removePropertyChangeListener(listener: PropertyChangeListener) {
        changeSupport.removePropertyChangeListener(listener)
    }
}

class PropetyChangeSupport(propetyChangeAware: PropetyChangeAware) {
    fun addPropertyChangelistener(listener: PropertyChangeListener) {
        TODO("Not yet implemented")
    }

    fun removePropertyChangeListener(propertyChangeListener: PropertyChangeListener) {
        TODO("Not yet implemented")
    }

    fun firePropertyChange(s: String, oldValue: Int, value: Int) {
        TODO("Not yet implemented")
    }

}
