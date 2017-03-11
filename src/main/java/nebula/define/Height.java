package nebula.define;

import nebula.define.annotation.InputSize;
import nebula.define.annotation.MaxLength;
import nebula.define.annotation.Uom;

@InputSize ("small")
@Uom ("cm")
@MaxLength (3)
public interface Height/*|zh:高 */ extends Long {
};