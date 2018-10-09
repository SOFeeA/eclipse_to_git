package Elem;
public abstract class element { 
	protected Integer m_counter = 1; 
	public abstract void write();

	/**
	 * Description of the method addCounter.
	 * @param i_add 
	 */
	public void addCounter(Integer i_add) {
		m_counter = m_counter + i_add;
	} 
}
