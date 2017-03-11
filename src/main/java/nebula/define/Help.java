package nebula.define;

import nebula.define.annotation.Desc;
import nebula.define.annotation.FormatType;
import nebula.define.annotation.MaxLength;

@MaxLength (2000)
@FormatType ( "textarea")
@Desc("多行的文本内容，可以使用Wiki标记")
public interface Help/*|zh:帮助 */ extends Text {
};