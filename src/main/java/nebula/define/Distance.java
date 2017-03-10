package nebula.define;

import nebula.define.InputSize;
import nebula.define.MaxLength;
import nebula.define.Uom;

@InputSize ("small")
@Uom ("KM")
@MaxLength (8)
public interface Distance/*|zh:距离 */ extends Length {
};