package tmp;

public class Ork implements Tailoring{

	private String craftMaterial;

	@Override
	public void craftLight(String craftMaterial) {
		this.craftMaterial = craftMaterial;
		System.out.println("craftLight");
	}

	@Override
	public String craftMedium(String craftMaterial) {
		System.out.println("craftMedium");
		return null;
	}

	@Override
	public String craftBones(String craftMaterial) {
		System.out.println("craftBones");
		return null;
	}

}
