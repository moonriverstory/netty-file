package code;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;

import java.util.List;

import util.ObjectConvertUtil;

/**
 * 解码器
 * @author kevin
 *
 */
public class NettyMessageDecoder extends MessageToMessageDecoder<String> {

	@Override
	protected void decode(ChannelHandlerContext ctx, String msg,
			List<Object> out) throws Exception {
		Object outobj = ObjectConvertUtil.convertModle(msg);
		out.add(outobj);
	}

    
}
