package nebula.define;

import nebula.define.annotation.Desc;
import nebula.define.annotation.FormatType;
import nebula.define.annotation.MaxLength;
import nebula.define.annotation.SingleLine;

@MaxLength ( 4000)
@FormatType ( "textarea")
@Desc("多行的文本内容，可以使用Wiki标记")
@SingleLine
public interface Note/*|zh:笔记 */ extends Text {
};