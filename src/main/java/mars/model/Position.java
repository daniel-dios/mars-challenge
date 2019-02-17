package mars.model;

public final class Position {
	private final Dimension coordinates;
	private final Orientation orientation;

	public Position(Dimension coordinates, Orientation orientation) {
		this.coordinates = coordinates;
		this.orientation = orientation;
	}

	public Dimension getCoordinates() {
		return coordinates;
	}

	Orientation getOrientation() {
		return orientation;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Position position = (Position) o;

		if (!coordinates.equals(position.coordinates)) return false;
		return orientation == position.orientation;
	}

	@Override
	public int hashCode() {
		int result = coordinates.hashCode();
		result = 31 * result + orientation.hashCode();
		return result;
	}

	@Override
	public String toString() {
		return coordinates.getX()+ " " + coordinates.getY() + " " + orientation;
	}
}