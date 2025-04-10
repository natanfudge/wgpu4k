package io.ygdrasil.webgpu

class WGPUContext(
    val surface: Surface,
    val adapter: GPUAdapter,
    val device: GPUDevice,
    val renderingContext: RenderingContext,
) : AutoCloseable {


    override fun close() {
        renderingContext.close()
        surface.close()
        adapter.close()
        device.close()
    }

}