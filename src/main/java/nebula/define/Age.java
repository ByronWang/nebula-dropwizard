package nebula.define;

import nebula.define.InputSize;
import nebula.define.Long;
import nebula.define.Max;
import nebula.define.MaxLength;
import nebula.define.Min;

@InputSize("small")
@MaxLength(3)
@Min(0)
@Max(160)
public interface Age/*|年龄 */ extends Long {
};