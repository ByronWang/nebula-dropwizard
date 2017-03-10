package nebula.define;

import nebula.define.Decimal;
import nebula.define.MaxLength;

@MaxLength(15)
public interface Amount /*|zh:金额 */ extends Decimal {
};