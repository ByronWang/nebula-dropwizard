package nebula.define;

public interface YesNo extends Boolean {
	static YesNo Yes = R.of(true);
	static YesNo No = R.of(false);
};