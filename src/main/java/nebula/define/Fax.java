package nebula.define;

import nebula.define.FormatType;
import nebula.define.MaxLength;
import nebula.define.MinLength;
import nebula.define.String;

@FormatType ( "numeric")
@MaxLength ( 20)
@MinLength ( 6)
public interface Fax/*|zh:传真号码*/ extends String {
};