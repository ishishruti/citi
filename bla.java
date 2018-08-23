
public class bla {
	private String string;
	
	public bla() {
		// TODO Auto-generated constructor stub
	}

	public bla(String string) {
		super();
		this.string = string;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 9;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		bla other = (bla) obj;
		if (string == null) {
			if (other.string != null)
				return false;
		} else if (!string.equals(other.string))
			return false;
		return true;
	}
	
}
