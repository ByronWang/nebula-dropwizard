package nebula.define;

import nebula.define.Desc;
import nebula.define.FormatType;
import nebula.define.MaxLength;
import nebula.define.SingleLine;
import nebula.define.Text;

@MaxLength ( 4000)
@FormatType ( "textarea")
@Desc("多行的文本内容，可以使用Wiki标记")
@SingleLine
public interface Note/*|zh:笔记 */ extends Text {
};