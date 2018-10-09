package App;

import Elem.AElem;
import Elem.BElem;
import Elem.element;

public class core {
	public core(Integer i_maxElem) {
		super();
		this.m_maxElem = i_maxElem;
	}

	private element m_elem = null;
	private Integer m_maxElem = 0;
	private Integer m_ElemCount = 0;

	public void createElement() {
		if (m_ElemCount <= m_maxElem)
			m_elem = new AElem();
		else {
			m_elem = new BElem();
		}
		m_ElemCount = m_ElemCount + 1;
	}

	/**
	 * Description of the method finish.
	 */
	public void finish() {
		m_elem.write();
	}

}
