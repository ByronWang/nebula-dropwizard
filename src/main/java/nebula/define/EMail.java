package nebula.define;

import nebula.define.annotation.FormatType;
import nebula.define.annotation.InputSize;
import nebula.define.annotation.MaxLength;

@FormatType ( "email")
@InputSize ( "large")
@MaxLength ( 120)
public interface EMail/*|zh:邮件地址*/ extends String {
};