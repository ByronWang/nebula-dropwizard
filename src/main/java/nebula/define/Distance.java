package nebula.define;

import nebula.define.annotation.InputSize;
import nebula.define.annotation.MaxLength;
import nebula.define.annotation.Uom;

@InputSize ("small")
@Uom ("KM")
@MaxLength (8)
public interface Distance/*|zh:距离 */ extends Length {
};