#!/bin/bash

# Logo Generation Script for MovieApp
# This script converts SVG logos to PNG format for better compatibility

echo "🎬 Generating PNG versions of MovieApp logos..."

# Check if ImageMagick is installed
if ! command -v convert &> /dev/null; then
    echo "❌ ImageMagick not found. Please install it first:"
    echo "   brew install imagemagick"
    exit 1
fi

# Create PNG directory
mkdir -p assets/logo/png

# Convert SVG to PNG with different sizes
echo "📐 Converting logos to PNG format..."

# Full logo - multiple sizes
convert assets/logo/movieapp-logo.svg -resize 200x200 assets/logo/png/movieapp-logo-200.png
convert assets/logo/movieapp-logo.svg -resize 400x400 assets/logo/png/movieapp-logo-400.png
convert assets/logo/movieapp-logo.svg -resize 800x800 assets/logo/png/movieapp-logo-800.png

# Mini logo - multiple sizes
convert assets/logo/movieapp-logo-mini.svg -resize 120x120 assets/logo/png/movieapp-logo-mini-120.png
convert assets/logo/movieapp-logo-mini.svg -resize 240x240 assets/logo/png/movieapp-logo-mini-240.png
convert assets/logo/movieapp-logo-mini.svg -resize 480x480 assets/logo/png/movieapp-logo-mini-480.png

# Text logo
convert assets/logo/movieapp-text-logo.svg -resize 300x80 assets/logo/png/movieapp-text-logo-300.png
convert assets/logo/movieapp-text-logo.svg -resize 600x160 assets/logo/png/movieapp-text-logo-600.png

# Favicon
convert assets/logo/movieapp-favicon.svg -resize 32x32 assets/logo/png/movieapp-favicon-32.png
convert assets/logo/movieapp-favicon.svg -resize 64x64 assets/logo/png/movieapp-favicon-64.png

echo "✅ PNG logos generated successfully!"
echo "📁 Check the assets/logo/png/ directory for all PNG versions"

# List generated files
echo ""
echo "📋 Generated files:"
ls -la assets/logo/png/
