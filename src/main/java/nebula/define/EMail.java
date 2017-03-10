package nebula.define;

import nebula.define.FormatType;
import nebula.define.InputSize;
import nebula.define.MaxLength;
import nebula.define.String;

@FormatType ( "email")
@InputSize ( "large")
@MaxLength ( 120)
public interface EMail/*|zh:邮件地址*/ extends String {
};