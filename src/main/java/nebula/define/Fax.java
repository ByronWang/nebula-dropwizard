package nebula.define;

import nebula.define.annotation.FormatType;
import nebula.define.annotation.MaxLength;
import nebula.define.annotation.MinLength;

@FormatType ( "numeric")
@MaxLength ( 20)
@MinLength ( 6)
public interface Fax/*|zh:传真号码*/ extends String {
};