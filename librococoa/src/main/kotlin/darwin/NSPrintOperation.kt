package darwin 

import org.rococoa.ObjCClass
import org.rococoa.cocoa.foundation.NSInteger

/**
 * This file was autogenerated by [JNAerator](http://jnaerator.googlecode.com/),<br></br>
 * a tool written by [Olivier Chafik](http://ochafik.free.fr/) that [uses a few opensource projects.](http://code.google.com/p/jnaerator/wiki/CreditsAndLicense).<br></br>
 * For help, please visit [NativeLibs4Java](http://nativelibs4java.googlecode.com/), [Rococoa](http://rococoa.dev.java.net/), or [JNA](http://jna.dev.java.net/).
 */
abstract class NSPrintOperation : NSObject() {
	interface _Class : ObjCClass {
		/**
		 * Factory methods that create a new NSPrintOperation for printing, copying to Portable Document Format, or copying to Encapsulated PostScript. The passed-in NSPrintInfo is copied, and the copy is retained by the new NSPrintOperation. (So, no need to copy the NSPrintInfo you pass to these.) You can get the copy with -printInfo.<br></br>
		 * Original signature : `+(NSPrintOperation*)printOperationWithView:(NSView*) printInfo:(NSPrintInfo*)`<br></br>
		 * *native declaration : /System/Library/Frameworks/framework/Headers/AppKitDefines.h:90*
		 */
		fun printOperationWithView_printInfo(view: NSView?, printInfo: NSPrintInfo?): NSPrintOperation?
		/**
		 * *native declaration : /System/Library/Frameworks/framework/Headers/AppKitDefines.h:91*<br></br>
		 * Conversion Error : /// Original signature : `+(NSPrintOperation*)PDFOperationWithView:(NSView*) insideRect:() toData:(NSMutableData*) printInfo:(NSPrintInfo*)`<br></br>
		 * + (NSPrintOperation*)PDFOperationWithView:(NSView*)view insideRect:(null)rect toData:(NSMutableData*)data printInfo:(NSPrintInfo*)printInfo; (Argument rect cannot be converted)
		 */
		/**
		 * *native declaration : /System/Library/Frameworks/framework/Headers/AppKitDefines.h:92*<br></br>
		 * Conversion Error : /// Original signature : `+(NSPrintOperation*)PDFOperationWithView:(NSView*) insideRect:() toPath:(NSString*) printInfo:(NSPrintInfo*)`<br></br>
		 * + (NSPrintOperation*)PDFOperationWithView:(NSView*)view insideRect:(null)rect toPath:(NSString*)path printInfo:(NSPrintInfo*)printInfo; (Argument rect cannot be converted)
		 */
		/**
		 * *native declaration : /System/Library/Frameworks/framework/Headers/AppKitDefines.h:93*<br></br>
		 * Conversion Error : /// Original signature : `+(NSPrintOperation*)EPSOperationWithView:(NSView*) insideRect:() toData:(NSMutableData*) printInfo:(NSPrintInfo*)`<br></br>
		 * + (NSPrintOperation*)EPSOperationWithView:(NSView*)view insideRect:(null)rect toData:(NSMutableData*)data printInfo:(NSPrintInfo*)printInfo; (Argument rect cannot be converted)
		 */
		/**
		 * *native declaration : /System/Library/Frameworks/framework/Headers/AppKitDefines.h:94*<br></br>
		 * Conversion Error : /// Original signature : `+(NSPrintOperation*)EPSOperationWithView:(NSView*) insideRect:() toPath:(NSString*) printInfo:(NSPrintInfo*)`<br></br>
		 * + (NSPrintOperation*)EPSOperationWithView:(NSView*)view insideRect:(null)rect toPath:(NSString*)path printInfo:(NSPrintInfo*)printInfo; (Argument rect cannot be converted)
		 */
		/**
		 * Slight conveniences, for use when the application's global NSPrintInfo is appropriate. Each of these methods invokes [NSPrintInfo sharedPrintInfo] and then invokes the like-named method listed above.<br></br>
		 * Original signature : `+(NSPrintOperation*)printOperationWithView:(NSView*)`<br></br>
		 * *native declaration : /System/Library/Frameworks/framework/Headers/AppKitDefines.h:98*
		 */
		fun printOperationWithView(view: NSView?): NSPrintOperation?
		/**
		 * *native declaration : /System/Library/Frameworks/framework/Headers/AppKitDefines.h:99*<br></br>
		 * Conversion Error : /// Original signature : `+(NSPrintOperation*)PDFOperationWithView:(NSView*) insideRect:() toData:(NSMutableData*)`<br></br>
		 * + (NSPrintOperation*)PDFOperationWithView:(NSView*)view insideRect:(null)rect toData:(NSMutableData*)data; (Argument rect cannot be converted)
		 */
		/**
		 * *native declaration : /System/Library/Frameworks/framework/Headers/AppKitDefines.h:100*<br></br>
		 * Conversion Error : /// Original signature : `+(NSPrintOperation*)EPSOperationWithView:(NSView*) insideRect:() toData:(NSMutableData*)`<br></br>
		 * + (NSPrintOperation*)EPSOperationWithView:(NSView*)view insideRect:(null)rect toData:(NSMutableData*)data; (Argument rect cannot be converted)
		 */
		/**
		 * The current print operation for this thread. If this is nil, there is no current operation for the current thread.<br></br>
		 * Original signature : `+(NSPrintOperation*)currentOperation`<br></br>
		 * *native declaration : /System/Library/Frameworks/framework/Headers/AppKitDefines.h:104*
		 */
		fun currentOperation(): NSPrintOperation?

		/**
		 * Original signature : `+(void)setCurrentOperation:(NSPrintOperation*)`<br></br>
		 * *native declaration : /System/Library/Frameworks/framework/Headers/AppKitDefines.h:105*
		 */
		fun setCurrentOperation(operation: NSPrintOperation?)

		/// <i>native declaration : /System/Library/Frameworks/framework/Headers/AppKitDefines.h</i>
		fun alloc(): NSPrintOperation?
	}

	/**
	 * Return YES if the operation for copying to PDF or EPS, NO if it's for printing.<br></br>
	 * Original signature : `-(BOOL)isCopyingOperation`<br></br>
	 * *native declaration : /System/Library/Frameworks/framework/Headers/AppKitDefines.h:109*
	 */
	abstract fun isCopyingOperation(): Boolean

	/**
	 * The title of the print job. If a job title is set it overrides anything that might be gotten by sending the printed view an [NSView(NSPrinting) printJobTitle] message.<br></br>
	 * Original signature : `-(void)setJobTitle:(NSString*)`<br></br>
	 * *native declaration : /System/Library/Frameworks/framework/Headers/AppKitDefines.h:115*
	 */
	abstract fun setJobTitle(jobTitle: com.sun.jna.Pointer?)

	/**
	 * Original signature : `-(NSString*)jobTitle`<br></br>
	 * *native declaration : /System/Library/Frameworks/framework/Headers/AppKitDefines.h:116*
	 */
	abstract fun jobTitle(): com.sun.jna.Pointer?

	/**
	 * Whether the print and progress panels are shown during the operation.<br></br>
	 * Original signature : `-(void)setShowsPrintPanel:(BOOL)`<br></br>
	 * *native declaration : /System/Library/Frameworks/framework/Headers/AppKitDefines.h:124*
	 */
	abstract fun setShowsPrintPanel(flag: Boolean)

	/**
	 * Original signature : `-(BOOL)showsPrintPanel`<br></br>
	 * *native declaration : /System/Library/Frameworks/framework/Headers/AppKitDefines.h:125*
	 */
	abstract fun showsPrintPanel(): Boolean

	/**
	 * Original signature : `-(void)setShowsProgressPanel:(BOOL)`<br></br>
	 * *native declaration : /System/Library/Frameworks/framework/Headers/AppKitDefines.h:126*
	 */
	abstract fun setShowsProgressPanel(flag: Boolean)

	/**
	 * Original signature : `-(BOOL)showsProgressPanel`<br></br>
	 * *native declaration : /System/Library/Frameworks/framework/Headers/AppKitDefines.h:127*
	 */
	abstract fun showsProgressPanel(): Boolean

	/**
	 * The print panel to be presented by the operation when it is run, if showsProgressPanel is YES and isCopyingOperation is NO. -printPanel will create a new NSPrintPanel if one hasn't been set yet.<br></br>
	 * Original signature : `-(void)setPrintPanel:(NSPrintPanel*)`<br></br>
	 * *native declaration : /System/Library/Frameworks/framework/Headers/AppKitDefines.h:133*
	 */
	abstract fun setPrintPanel(panel: NSPrintPanel?)

	/**
	 * Original signature : `-(NSPrintPanel*)printPanel`<br></br>
	 * *native declaration : /System/Library/Frameworks/framework/Headers/AppKitDefines.h:134*
	 */
	abstract fun printPanel(): NSPrintPanel?

	/**
	 * Whether the print operation should spawn a separate thread in which to run itself.<br></br>
	 * Original signature : `-(void)setCanSpawnSeparateThread:(BOOL)`<br></br>
	 * *native declaration : /System/Library/Frameworks/framework/Headers/AppKitDefines.h:138*
	 */
	abstract fun setCanSpawnSeparateThread(canSpawnSeparateThread: Boolean)

	/**
	 * Original signature : `-(BOOL)canSpawnSeparateThread`<br></br>
	 * *native declaration : /System/Library/Frameworks/framework/Headers/AppKitDefines.h:139*
	 */
	abstract fun canSpawnSeparateThread(): Boolean

	/**
	 * The page order that will be used to generate the pages in this job. This is the physical page order of the pages. It depends on the stacking order of the printer, the capability of the app to reverse page order, etc.<br></br>
	 * Original signature : `-(void)setPageOrder:(NSPrintingPageOrder)`<br></br>
	 * *native declaration : /System/Library/Frameworks/framework/Headers/AppKitDefines.h:143*<br></br>
	 *
	 * @param pageOrder @see AppKitLibrary#NSPrintingPageOrder
	 */
	abstract fun setPageOrder(pageOrder: Int)

	/**
	 * Original signature : `-(NSPrintingPageOrder)pageOrder`<br></br>
	 * *native declaration : /System/Library/Frameworks/framework/Headers/AppKitDefines.h:144*
	 */
	abstract
		/**
		 * @see AppKitLibrary.NSPrintingPageOrder
		 */
	fun pageOrder(): Int

	/**
	 * Do the print operation, with panels that are document-modal to a specific window. When the operation has been completed, send the message selected by didRunSelector to the delegate, with the contextInfo as the last argument. The method selected by didRunSelector must have the same signature as:<br></br>
	 * - (void)printOperationDidRun:(NSPrintOperation *)printOperation success:(BOOL)success contextInfo:(void *)contextInfo;<br></br>
	 * This can only be invoked once. Create a new NSPrintOperation instance for each operation. When this method completes, the object is removed from being the current operation if it is the current operation.<br></br>
	 * Original signature : `-(void)runOperationModalForWindow:(NSWindow*) delegate:(id) didRunSelector:(SEL) contextInfo:(void*)`<br></br>
	 * *native declaration : /System/Library/Frameworks/framework/Headers/AppKitDefines.h:152*
	 */
	abstract fun runOperationModalForWindow_delegate_didRunSelector_contextInfo(
		docWindow: NSWindow?,
		delegate: org.rococoa.ID?,
		didRunSelector: org.rococoa.Selector?,
		contextInfo: NSObject?
	)

	/**
	 * Do the print operation, with application-modal panels. Return YES if the operation completed successfully, NO if there was an error or the user cancelled the operation. This can only be invoked once. Create a new NSPrintOperation instance for each operation. When this method completes, the object is removed from being the current operation if it is the current operation.<br></br>
	 * Original signature : `-(BOOL)runOperation`<br></br>
	 * *native declaration : /System/Library/Frameworks/framework/Headers/AppKitDefines.h:156*
	 */
	abstract fun runOperation(): Boolean

	/**
	 * The view being printed.<br></br>
	 * Original signature : `-(NSView*)view`<br></br>
	 * *native declaration : /System/Library/Frameworks/framework/Headers/AppKitDefines.h:160*
	 */
	abstract fun view(): NSView?

	/**
	 * The print info of the operation. -printInfo always returns a copy of the NSPrintInfo passed into the factory method used to create the print operation, unless -setPrintInfo: has been invoked, in which case it returns the exact same object passed into -setPrintInfo:. So, the factory methods listed above copy the passed-in NSPrintInfo, but -setPrintInfo: doesn't.<br></br>
	 * Original signature : `-(NSPrintInfo*)printInfo`<br></br>
	 * *native declaration : /System/Library/Frameworks/framework/Headers/AppKitDefines.h:164*
	 */
	abstract fun printInfo(): NSPrintInfo?

	/**
	 * Original signature : `-(void)setPrintInfo:(NSPrintInfo*)`<br></br>
	 * *native declaration : /System/Library/Frameworks/framework/Headers/AppKitDefines.h:165*
	 */
	abstract fun setPrintInfo(printInfo: NSPrintInfo?)

	/**
	 * The context for the output of this operation.<br></br>
	 * Original signature : `-(NSGraphicsContext*)context`<br></br>
	 * *native declaration : /System/Library/Frameworks/framework/Headers/AppKitDefines.h:169*
	 */
	abstract fun context(): com.sun.jna.Pointer?

	/**
	 * The first through last one-based page numbers of the operation as it's being previewed or printed. The first page number might not be 1, and the page count might be NSIntegerMax to indicate that the number of pages is not known, depending on what the printed view returned when sent an [NSView(NSPrinting) knowsPageRange:] message.<br></br>
	 * Original signature : `-(id)pageRange`<br></br>
	 * *native declaration : /System/Library/Frameworks/framework/Headers/AppKitDefines.h:175*
	 */
	abstract fun pageRange(): org.rococoa.ID?

	/**
	 * The current one-based page number of the operation as it's being previewed or printed.<br></br>
	 * Original signature : `-(NSInteger)currentPage`<br></br>
	 * *native declaration : /System/Library/Frameworks/framework/Headers/AppKitDefines.h:181*
	 */
	abstract fun currentPage(): NSInteger?

	/**
	 * Methods that are invoked by the print operation itself as it proceeds. You should not invoke them.<br></br>
	 * Original signature : `-(NSGraphicsContext*)createContext`<br></br>
	 * *native declaration : /System/Library/Frameworks/framework/Headers/AppKitDefines.h:185*
	 */
	abstract fun createContext(): com.sun.jna.Pointer?

	/**
	 * Original signature : `-(void)destroyContext`<br></br>
	 * *native declaration : /System/Library/Frameworks/framework/Headers/AppKitDefines.h:186*
	 */
	abstract fun destroyContext()

	/**
	 * Original signature : `-(BOOL)deliverResult`<br></br>
	 * *native declaration : /System/Library/Frameworks/framework/Headers/AppKitDefines.h:187*
	 */
	abstract fun deliverResult(): Boolean

	/**
	 * Original signature : `-(void)cleanUpOperation`<br></br>
	 * *native declaration : /System/Library/Frameworks/framework/Headers/AppKitDefines.h:188*
	 */
	abstract fun cleanUpOperation()

	companion object {
		val CLASS: _Class = org.rococoa.Rococoa.createClass("NSPrintOperation", _Class::class.java)

		/**
		 * Factory methods that create a new NSPrintOperation for printing, copying to Portable Document Format, or copying to Encapsulated PostScript. The passed-in NSPrintInfo is copied, and the copy is retained by the new NSPrintOperation. (So, no need to copy the NSPrintInfo you pass to these.) You can get the copy with -printInfo.<br></br>
		 * Original signature : `+(NSPrintOperation*)printOperationWithView:(NSView*) printInfo:(NSPrintInfo*)`<br></br>
		 * *native declaration : /System/Library/Frameworks/framework/Headers/AppKitDefines.h:90*
		 */
		fun printOperationWithView_printInfo(view: NSView?, printInfo: NSPrintInfo?): NSPrintOperation? {
			return CLASS.printOperationWithView_printInfo(view, printInfo)
		}

		/**
		 * Slight conveniences, for use when the application's global NSPrintInfo is appropriate. Each of these methods invokes [NSPrintInfo sharedPrintInfo] and then invokes the like-named method listed above.<br></br>
		 * Original signature : `+(NSPrintOperation*)printOperationWithView:(NSView*)`<br></br>
		 * *native declaration : /System/Library/Frameworks/framework/Headers/AppKitDefines.h:98*
		 */
		fun printOperationWithView(view: NSView?): NSPrintOperation? {
			return CLASS.printOperationWithView(view)
		}

		/**
		 * The current print operation for this thread. If this is nil, there is no current operation for the current thread.<br></br>
		 * Original signature : `+(NSPrintOperation*)currentOperation`<br></br>
		 * *native declaration : /System/Library/Frameworks/framework/Headers/AppKitDefines.h:104*
		 */
		fun currentOperation(): NSPrintOperation? {
			return CLASS.currentOperation()
		}

		/**
		 * Original signature : `+(void)setCurrentOperation:(NSPrintOperation*)`<br></br>
		 * *native declaration : /System/Library/Frameworks/framework/Headers/AppKitDefines.h:105*
		 */
		fun setCurrentOperation(operation: NSPrintOperation?) {
			CLASS.setCurrentOperation(operation)
		}
	}
}
