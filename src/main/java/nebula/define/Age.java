package nebula.define;

import nebula.define.annotation.InputSize;
import nebula.define.annotation.Max;
import nebula.define.annotation.MaxLength;
import nebula.define.annotation.Min;

@InputSize("small")
@MaxLength(3)
@Min(0)
@Max(160)
public interface Age/* |年龄 */ extends Long {
	Age $plus(Age age);
};