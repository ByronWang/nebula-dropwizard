package nebula.define;

import nebula.define.Boolean;
import static nebula.define.Runtime.*;

public interface YesNo extends Boolean {
	static public YesNo Yes = _C(true);
	static public YesNo No = _C(false);
};