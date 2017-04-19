package client;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;

import java.util.List;

import util.ObjectConvertUtil;

/**
 * 解码器
 * @author kevin
 *
 */
public class NettyMessageDecoder extends MessageToMessageDecoder<Object> {

	@Override
	protected void decode(ChannelHandlerContext ctx, Object msg,
			List<Object> out) throws Exception {
		String o = msg.toString();
		Object outobj = ObjectConvertUtil.convertModle(o);
		out.add(outobj);
	}

    
}
