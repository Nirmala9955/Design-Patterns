package com.sahu.product;

public class House {
	private IBasement iBasement;
	private IStructure iStructure;
	private IRoof iRoof;
	private IInterior iInterior;

	public void setBasement(IBasement iBasement) {
		this.iBasement = iBasement;
	}

	public void setStructure(IStructure iStructure) {
		this.iStructure = iStructure;
	}

	public void setRoof(IRoof iRoof) {
		this.iRoof = iRoof;
	}

	public void setInterior(IInterior iInterior) {
		this.iInterior = iInterior;
	}

	@Override
	public String toString() {
		return "House [basement=" + iBasement + ", structure=" + iStructure + ", roof=" + iRoof + ", interior=" + iInterior
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
