package nebula.define;

import nebula.define.InputSize;
import nebula.define.Long;
import nebula.define.MaxLength;
import nebula.define.Uom;

@InputSize ("small")
@Uom ("cm")
@MaxLength (3)
public interface Height/*|zh:高 */ extends Long {
};